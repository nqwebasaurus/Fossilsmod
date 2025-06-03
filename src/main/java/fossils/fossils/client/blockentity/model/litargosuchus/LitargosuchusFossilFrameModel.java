package fossils.fossils.client.blockentity.model.litargosuchus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LitargosuchusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public LitargosuchusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backLeftLeg = this.main.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backRightLeg = this.main.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.body = this.main.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.frontLeftLeg = this.body2.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.body2.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.neck = this.body2.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -12.8F, -1.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(1.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(-0.1F, -10.0F, -0.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-2.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.9F, -11.0F, -10.4F, 0.3927F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(2.9F, -11.0F, -10.4F, 0.0F, -0.3927F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create().texOffs(36, 9).addBox(-0.5F, -0.5F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, -12.35F, 1.0F));

		PartDefinition backLeftLeg = main.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1114F, 0.5363F, -1.6339F, -0.1745F, 0.0F, -0.1309F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0464F, 5.5022F, 0.5442F, 1.1558F, -0.0181F, 0.1193F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1931F, 5.3866F, 0.3901F, -1.0036F, 0.0F, 0.0F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5939F, 0.0386F, 0.5498F, 0.0F, 0.0F));

		PartDefinition backRightLeg = main.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1114F, 0.5363F, -1.6339F, 0.0436F, 0.0F, 0.1309F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0464F, 5.5022F, 0.5442F, 1.1994F, 0.0181F, -0.1193F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1931F, 5.3866F, 0.3901F, -0.48F, 0.0F, 0.0F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5939F, 0.0386F, 0.8988F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, -0.1034F, -0.4224F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F))
				.texOffs(25, 17).addBox(-0.5F, -0.1034F, 5.9776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.425F, 1.4F, -0.0318F, 0.0771F, -0.1369F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, 0.109F, -0.2129F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.2801F, 6.552F, -0.0685F, -0.2231F, 0.0736F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 11).addBox(-0.5F, -0.0246F, -0.564F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F))
				.texOffs(6, 17).addBox(-0.5F, -0.0246F, 6.836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1162F, 6.5678F, 0.1963F, -0.3684F, -0.1224F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1174F, -0.2992F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1015F, 7.4871F, 0.0395F, -0.3167F, -0.1017F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -3.225F, 0.2395F, -0.2924F, -0.0995F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 27).addBox(-1.5F, -0.1064F, 6.8633F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 21).addBox(-1.5F, -0.1064F, 0.4633F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0F, -0.1951F, -7.3528F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1968F, -6.479F, -0.2252F, -0.1181F, 0.0714F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 36).addBox(-0.5F, -0.4F, 0.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 1.4052F, -4.3307F, 0.2443F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = body2.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3954F, 2.3012F, -2.0491F, -0.0814F, -0.1706F, -0.056F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5471F, 3.4215F, 0.118F, -1.0469F, 0.0664F, 0.0462F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.04F, 4.5479F, -0.2442F, 0.4282F, -0.0079F, -0.0112F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0157F, 2.391F, 0.2084F, 1.423F, -0.0223F, -0.0068F));

		PartDefinition frontRightLeg = body2.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3954F, 2.3012F, -2.0491F, 0.3561F, -0.0468F, 0.0737F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5471F, 3.4215F, 0.118F, -1.3088F, -0.0674F, -0.0446F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.04F, 4.5479F, -0.2442F, 0.4669F, -0.0001F, 0.0839F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0157F, 2.391F, 0.2084F, 0.9867F, 0.0223F, 0.0068F));

		PartDefinition neck = body2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7911F, -3.4403F, -0.1907F, -0.3053F, -0.0083F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(25, 41).addBox(-1.0F, 0.0487F, -0.7535F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -0.4178F, -2.4449F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1141F, -2.5261F, -0.2954F, -0.4606F, -0.1773F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 38).addBox(-1.0F, 0.1961F, 0.2057F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, -1.1037F, -2.6688F, -0.2443F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4795F, -1.9514F, 0.2184F, 0.0416F, 0.0131F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3769F, -0.1018F, 0.5061F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 72, 72);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}