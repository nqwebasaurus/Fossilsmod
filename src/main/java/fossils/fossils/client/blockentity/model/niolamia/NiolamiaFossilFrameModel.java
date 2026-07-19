package fossils.fossils.client.blockentity.model.niolamia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NiolamiaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Waluchelys;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftCarapace;
	private final ModelPart rightCarapace;

	public NiolamiaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Waluchelys = this.fossil.getChild("Waluchelys");
		this.frontleftleg4 = this.Waluchelys.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Waluchelys.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.chest = this.Waluchelys.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.frontleftleg = this.chest.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.chest.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.Waluchelys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftCarapace = this.Waluchelys.getChild("leftCarapace");
		this.rightCarapace = this.Waluchelys.getChild("rightCarapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.8F, -3.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.0F, -6.2F, -5.3F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.05F, -3.6F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.0F, -6.2F, -5.3F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(1.6F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.4F, -6.2F, 5.7F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.625F, 0.2F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.4F, -6.2F, 5.7F, 0.0F, -0.2618F, 0.0F));

		PartDefinition Waluchelys = fossil.addOrReplaceChild("Waluchelys", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -2.5F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r5 = Waluchelys.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(18, 46).addBox(-0.5F, 0.7F, -2.875F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -8.9405F, -3.809F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Waluchelys.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 45).addBox(-0.5F, 0.55F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -9.2256F, -0.7959F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Waluchelys.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 45).addBox(-0.5F, -0.225F, 2.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 43).addBox(-0.5F, -0.225F, -0.65F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.6776F, 6.1461F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Waluchelys.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 62).addBox(-0.5F, 0.925F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -6.0556F, 6.2089F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Waluchelys.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 49).addBox(-0.5F, 0.925F, -0.025F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -7.6316F, 4.9776F, -0.9076F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Waluchelys.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 50).addBox(-0.5F, 0.5F, -0.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -8.7607F, 2.1696F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Waluchelys.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(44, 29).addBox(-0.5F, 0.45F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -8.9192F, 0.8792F, -0.1222F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Waluchelys.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3331F, -1.7778F, 6.6051F, -0.0953F, 0.1555F, -0.6617F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.298F, 2.6691F, -0.9986F, -0.3944F, -0.8555F, 0.8358F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5085F, 3.2017F, -0.7034F, 0.2963F, 0.4134F, -0.0031F));

		PartDefinition frontrightleg4 = Waluchelys.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3331F, -1.7778F, 6.6051F, -0.0953F, -0.1555F, 0.6617F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.298F, 2.6691F, -0.9986F, -0.3944F, 0.8555F, -0.8358F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5085F, 3.2017F, -0.7034F, 0.2963F, -0.4134F, 0.0031F));

		PartDefinition chest = Waluchelys.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -7.3016F, -6.2428F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chest.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(2, 35).addBox(-0.5F, 0.55F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(0, 32).addBox(-0.5F, 0.55F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1043F, 3.6111F, -2.6926F, -0.2256F, 0.2555F, -0.0579F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1043F, 3.6111F, -2.6926F, -0.2256F, -0.2555F, 0.0579F));

		PartDefinition frontleftleg = chest.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8269F, 4.2487F, -1.6515F, -0.4166F, -0.2696F, -0.3699F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9854F, 3.2963F, -0.5424F, 0.2059F, -0.551F, 0.3102F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.5679F, -0.2199F, 0.5455F, 0.011F));

		PartDefinition frontrightleg = chest.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8269F, 4.2487F, -1.6515F, -0.4166F, 0.2696F, 0.3699F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9854F, 3.2963F, -0.5424F, 0.2059F, 0.551F, -0.3102F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.5679F, -0.2199F, -0.5455F, -0.011F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4509F, -3.506F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 66).addBox(-1.0F, 1.0F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.45F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9906F, -1.6125F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(47, 2).addBox(-1.0F, -0.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 0).addBox(-1.0F, -0.5F, -0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0572F, -2.5913F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.9998F, -1.8633F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.575F, -1.6452F, -1.0427F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.575F, -1.6452F, -1.0427F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9219F, -0.6034F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail = Waluchelys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(14, 67).addBox(-0.5F, -0.075F, -0.35F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 68).addBox(-0.5F, -0.075F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.5F, -1.4686F, 7.9237F, -0.637F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(63, 66).addBox(-0.5F, -0.2875F, -0.119F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2263F, 1.889F, 0.1861F, -0.1716F, -0.0321F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 67).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5625F, 1.7309F, 0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2955F, 1.9515F, 0.2748F, -0.2102F, -0.0588F));

		PartDefinition cube_r16 = tail3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(42, 36).addBox(-0.475F, -0.3F, -0.175F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.15F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(7, 66).addBox(-0.5F, 0.375F, -0.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6799F, 2.8384F, 0.2438F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0313F, 1.8341F, -0.157F, -0.2618F, -0.0045F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0197F, 1.9602F, 0.0169F, 0.0F, 0.0F));

		PartDefinition leftCarapace = Waluchelys.addOrReplaceChild("leftCarapace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.8F, 0.25F));

		PartDefinition rightCarapace = Waluchelys.addOrReplaceChild("rightCarapace", CubeListBuilder.create(), PartPose.offset(-2.0F, -0.8F, 0.25F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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