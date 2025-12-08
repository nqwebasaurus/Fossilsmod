package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NectocarisFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Center;
	private final ModelPart head1;
	private final ModelPart finL;
	private final ModelPart finR;
	private final ModelPart head2;
	private final ModelPart finL2;
	private final ModelPart finR2;
	private final ModelPart head3;
	private final ModelPart finL3;
	private final ModelPart finR3;
	private final ModelPart head4;
	private final ModelPart finL4;
	private final ModelPart finR4;
	private final ModelPart head5;
	private final ModelPart finL5;
	private final ModelPart finR5;
	private final ModelPart head6;
	private final ModelPart finL6;
	private final ModelPart finR6;
	private final ModelPart nozzle;
	private final ModelPart eye1;
	private final ModelPart eye2;
	private final ModelPart eye3;
	private final ModelPart newtentacle;
	private final ModelPart newtentacle2;
	private final ModelPart newtentacle3;
	private final ModelPart newtentacle4;
	private final ModelPart newtentacle5;
	private final ModelPart newtentacle6;
	private final ModelPart newtentacle7;
	private final ModelPart newtentacle8;
	private final ModelPart newtentacle9;
	private final ModelPart newtentacle10;
	private final ModelPart newtentacle11;
	private final ModelPart newtentacle12;
	private final ModelPart newtentacle13;
	private final ModelPart newtentacle14;
	private final ModelPart newtentacletwo;
	private final ModelPart newtentacletwo2;
	private final ModelPart newtentacletwo3;
	private final ModelPart newtentacletwo4;
	private final ModelPart newtentacletwo5;
	private final ModelPart newtentacletwo6;
	private final ModelPart newtentacletwo7;
	private final ModelPart newtentacletwo8;
	private final ModelPart newtentacletwo9;
	private final ModelPart newtentacletwo10;
	private final ModelPart newtentacletwo11;
	private final ModelPart newtentacletwo12;
	private final ModelPart newtentacletwo13;
	private final ModelPart newtentacletwo14;

	public NectocarisFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Center = this.fossil.getChild("Center");
		this.head1 = this.Center.getChild("head1");
		this.finL = this.head1.getChild("finL");
		this.finR = this.head1.getChild("finR");
		this.head2 = this.head1.getChild("head2");
		this.finL2 = this.head2.getChild("finL2");
		this.finR2 = this.head2.getChild("finR2");
		this.head3 = this.head2.getChild("head3");
		this.finL3 = this.head3.getChild("finL3");
		this.finR3 = this.head3.getChild("finR3");
		this.head4 = this.head3.getChild("head4");
		this.finL4 = this.head4.getChild("finL4");
		this.finR4 = this.head4.getChild("finR4");
		this.head5 = this.head4.getChild("head5");
		this.finL5 = this.head5.getChild("finL5");
		this.finR5 = this.head5.getChild("finR5");
		this.head6 = this.head5.getChild("head6");
		this.finL6 = this.head6.getChild("finL6");
		this.finR6 = this.head6.getChild("finR6");
		this.nozzle = this.Center.getChild("nozzle");
		this.eye1 = this.Center.getChild("eye1");
		this.eye2 = this.Center.getChild("eye2");
		this.eye3 = this.Center.getChild("eye3");
		this.newtentacle = this.Center.getChild("newtentacle");
		this.newtentacle2 = this.newtentacle.getChild("newtentacle2");
		this.newtentacle3 = this.newtentacle2.getChild("newtentacle3");
		this.newtentacle4 = this.newtentacle3.getChild("newtentacle4");
		this.newtentacle5 = this.newtentacle4.getChild("newtentacle5");
		this.newtentacle6 = this.newtentacle5.getChild("newtentacle6");
		this.newtentacle7 = this.newtentacle6.getChild("newtentacle7");
		this.newtentacle8 = this.newtentacle7.getChild("newtentacle8");
		this.newtentacle9 = this.newtentacle8.getChild("newtentacle9");
		this.newtentacle10 = this.newtentacle9.getChild("newtentacle10");
		this.newtentacle11 = this.newtentacle10.getChild("newtentacle11");
		this.newtentacle12 = this.newtentacle11.getChild("newtentacle12");
		this.newtentacle13 = this.newtentacle12.getChild("newtentacle13");
		this.newtentacle14 = this.newtentacle13.getChild("newtentacle14");
		this.newtentacletwo = this.Center.getChild("newtentacletwo");
		this.newtentacletwo2 = this.newtentacletwo.getChild("newtentacletwo2");
		this.newtentacletwo3 = this.newtentacletwo2.getChild("newtentacletwo3");
		this.newtentacletwo4 = this.newtentacletwo3.getChild("newtentacletwo4");
		this.newtentacletwo5 = this.newtentacletwo4.getChild("newtentacletwo5");
		this.newtentacletwo6 = this.newtentacletwo5.getChild("newtentacletwo6");
		this.newtentacletwo7 = this.newtentacletwo6.getChild("newtentacletwo7");
		this.newtentacletwo8 = this.newtentacletwo7.getChild("newtentacletwo8");
		this.newtentacletwo9 = this.newtentacletwo8.getChild("newtentacletwo9");
		this.newtentacletwo10 = this.newtentacletwo9.getChild("newtentacletwo10");
		this.newtentacletwo11 = this.newtentacletwo10.getChild("newtentacletwo11");
		this.newtentacletwo12 = this.newtentacletwo11.getChild("newtentacletwo12");
		this.newtentacletwo13 = this.newtentacletwo12.getChild("newtentacletwo13");
		this.newtentacletwo14 = this.newtentacletwo13.getChild("newtentacletwo14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.0F, -24.0F, 16.0F, 2.0F, 46.0F, new CubeDeformation(0.003F))
				.texOffs(0, 0).addBox(-13.0F, -2.0F, -24.0F, 6.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -1.0F, 0.0F, 6.0F, 2.0F, 34.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-13.0F, -1.0F, -12.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Center = fossil.addOrReplaceChild("Center", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, -2.2F, -1.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-1.0F, -2.18F, 2.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition cube_r2 = Center.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 23).addBox(0.0F, -1.57F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -0.7F, -1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r3 = Center.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 35).addBox(-2.0F, -1.58F, 0.0F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -0.7F, -1.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition head1 = Center.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(25, 0).addBox(-3.0F, 0.8F, -3.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -1.0F));

		PartDefinition finL = head1.addOrReplaceChild("finL", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.5F, -2.0F));

		PartDefinition finR = head1.addOrReplaceChild("finR", CubeListBuilder.create().texOffs(26, 31).addBox(0.0F, 0.4F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(25, 8).addBox(-10.0F, 0.4F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.5F, -2.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(0, 15).addBox(-4.0F, 2.4F, -7.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.6F, -3.0F));

		PartDefinition finL2 = head2.addOrReplaceChild("finL2", CubeListBuilder.create(), PartPose.offset(-4.0F, 0.5F, -4.0F));

		PartDefinition finR2 = head2.addOrReplaceChild("finR2", CubeListBuilder.create().texOffs(23, 23).addBox(0.0F, 2.0F, -3.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-12.0F, 2.0F, -3.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.5F, -4.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(24, 15).addBox(-3.5F, 1.9F, -3.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -7.0F));

		PartDefinition finL3 = head3.addOrReplaceChild("finL3", CubeListBuilder.create(), PartPose.offset(-3.5F, 0.5F, -1.5F));

		PartDefinition finR3 = head3.addOrReplaceChild("finR3", CubeListBuilder.create().texOffs(31, 19).addBox(-0.5F, 1.5F, -1.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 31).addBox(-10.5F, 1.5F, -1.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.5F, -1.5F));

		PartDefinition head4 = head3.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(25, 4).addBox(-3.0F, 1.4F, -3.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -3.0F));

		PartDefinition finL4 = head4.addOrReplaceChild("finL4", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.5F, -1.0F));

		PartDefinition finR4 = head4.addOrReplaceChild("finR4", CubeListBuilder.create().texOffs(33, 35).addBox(-1.0F, 1.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 35).addBox(-8.0F, 1.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.5F, -1.0F));

		PartDefinition head5 = head4.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, 0.9F, -2.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -3.0F));

		PartDefinition finL5 = head5.addOrReplaceChild("finL5", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.5F, -1.0F));

		PartDefinition finR5 = head5.addOrReplaceChild("finR5", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.5F, -1.0F));

		PartDefinition head6 = head5.addOrReplaceChild("head6", CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, 0.9F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition finL6 = head6.addOrReplaceChild("finL6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, -1.0F));

		PartDefinition finR6 = head6.addOrReplaceChild("finR6", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 3).addBox(-3.0F, 0.5F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -1.0F));

		PartDefinition nozzle = Center.addOrReplaceChild("nozzle", CubeListBuilder.create().texOffs(0, 15).addBox(0.5F, -0.234F, -0.1072F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, -2.65F, 2.05F, -1.8762F, 0.0F, 1.5708F));

		PartDefinition eye1 = Center.addOrReplaceChild("eye1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -4.0F, 2.0F, 0.0F, 0.2182F, 0.1745F));

		PartDefinition eye2 = Center.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(37, 8).addBox(0.4F, 1.7F, -0.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, 2.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition eye3 = Center.addOrReplaceChild("eye3", CubeListBuilder.create().texOffs(24, 19).addBox(-2.4F, 1.7F, -0.5F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition newtentacle = Center.addOrReplaceChild("newtentacle", CubeListBuilder.create().texOffs(41, 13).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -2.6F, 3.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition newtentacle2 = newtentacle.addOrReplaceChild("newtentacle2", CubeListBuilder.create().texOffs(41, 11).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacle3 = newtentacle2.addOrReplaceChild("newtentacle3", CubeListBuilder.create().texOffs(5, 41).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition newtentacle4 = newtentacle3.addOrReplaceChild("newtentacle4", CubeListBuilder.create().texOffs(41, 4).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition newtentacle5 = newtentacle4.addOrReplaceChild("newtentacle5", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacle6 = newtentacle5.addOrReplaceChild("newtentacle6", CubeListBuilder.create().texOffs(0, 41).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition newtentacle7 = newtentacle6.addOrReplaceChild("newtentacle7", CubeListBuilder.create().texOffs(19, 40).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacle8 = newtentacle7.addOrReplaceChild("newtentacle8", CubeListBuilder.create().texOffs(14, 40).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition newtentacle9 = newtentacle8.addOrReplaceChild("newtentacle9", CubeListBuilder.create().texOffs(9, 40).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition newtentacle10 = newtentacle9.addOrReplaceChild("newtentacle10", CubeListBuilder.create().texOffs(38, 39).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -2.8362F, 0.0F));

		PartDefinition newtentacle11 = newtentacle10.addOrReplaceChild("newtentacle11", CubeListBuilder.create().texOffs(33, 39).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacle12 = newtentacle11.addOrReplaceChild("newtentacle12", CubeListBuilder.create().texOffs(28, 39).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition newtentacle13 = newtentacle12.addOrReplaceChild("newtentacle13", CubeListBuilder.create().texOffs(39, 27).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition newtentacle14 = newtentacle13.addOrReplaceChild("newtentacle14", CubeListBuilder.create().texOffs(25, 25).addBox(-0.51F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition newtentacletwo = Center.addOrReplaceChild("newtentacletwo", CubeListBuilder.create().texOffs(39, 25).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.75F, -2.6F, 3.0F));

		PartDefinition newtentacletwo2 = newtentacletwo.addOrReplaceChild("newtentacletwo2", CubeListBuilder.create().texOffs(39, 23).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition newtentacletwo3 = newtentacletwo2.addOrReplaceChild("newtentacletwo3", CubeListBuilder.create().texOffs(23, 39).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacletwo4 = newtentacletwo3.addOrReplaceChild("newtentacletwo4", CubeListBuilder.create().texOffs(5, 39).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition newtentacletwo5 = newtentacletwo4.addOrReplaceChild("newtentacletwo5", CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition newtentacletwo6 = newtentacletwo5.addOrReplaceChild("newtentacletwo6", CubeListBuilder.create().texOffs(38, 31).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.0F, 0.8F, 0.0F, 0.7418F, 0.0F));

		PartDefinition newtentacletwo7 = newtentacletwo6.addOrReplaceChild("newtentacletwo7", CubeListBuilder.create().texOffs(37, 12).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition newtentacletwo8 = newtentacletwo7.addOrReplaceChild("newtentacletwo8", CubeListBuilder.create().texOffs(30, 35).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition newtentacletwo9 = newtentacletwo8.addOrReplaceChild("newtentacletwo9", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 1.3526F, 0.0F));

		PartDefinition newtentacletwo10 = newtentacletwo9.addOrReplaceChild("newtentacletwo10", CubeListBuilder.create().texOffs(23, 41).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition newtentacletwo11 = newtentacletwo10.addOrReplaceChild("newtentacletwo11", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacletwo12 = newtentacletwo11.addOrReplaceChild("newtentacletwo12", CubeListBuilder.create().texOffs(16, 28).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition newtentacletwo13 = newtentacletwo12.addOrReplaceChild("newtentacletwo13", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, 0.5F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition newtentacletwo14 = newtentacletwo13.addOrReplaceChild("newtentacletwo14", CubeListBuilder.create().texOffs(25, 23).addBox(-0.49F, 0.49F, 0.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 100);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}