package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class WaptiaFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart base2;
	private final ModelPart body5;
	private final ModelPart rightgill7;
	private final ModelPart leftgill3;
	private final ModelPart rightgill8;
	private final ModelPart leftgill8;
	private final ModelPart rightgill9;
	private final ModelPart leftgill9;
	private final ModelPart rightgill10;
	private final ModelPart leftgill10;
	private final ModelPart rightgill11;
	private final ModelPart leftgill11;
	private final ModelPart rightgill12;
	private final ModelPart leftgill12;
	private final ModelPart body6;
	private final ModelPart body7;
	private final ModelPart body8;
	private final ModelPart leftleg6;
	private final ModelPart leftleg7;
	private final ModelPart leftleg8;
	private final ModelPart leftleg9;
	private final ModelPart leftleg10;
	private final ModelPart rightantenna2;
	private final ModelPart leftantenna2;
	private final ModelPart carapace2;
	private final ModelPart bone;
	private final ModelPart base;
	private final ModelPart body1;
	private final ModelPart rightgill1;
	private final ModelPart leftgill1;
	private final ModelPart rightgill2;
	private final ModelPart leftgill2;
	private final ModelPart rightgill3;
	private final ModelPart leftgill7;
	private final ModelPart rightgill4;
	private final ModelPart leftgill4;
	private final ModelPart rightgill5;
	private final ModelPart leftgill5;
	private final ModelPart rightgill6;
	private final ModelPart leftgill6;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftleg4;
	private final ModelPart leftleg5;
	private final ModelPart rightantenna;
	private final ModelPart leftantenna;
	private final ModelPart carapace;

	public WaptiaFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.base2 = this.fossil.getChild("base2");
		this.body5 = this.base2.getChild("body5");
		this.rightgill7 = this.body5.getChild("rightgill7");
		this.leftgill3 = this.body5.getChild("leftgill3");
		this.rightgill8 = this.body5.getChild("rightgill8");
		this.leftgill8 = this.body5.getChild("leftgill8");
		this.rightgill9 = this.body5.getChild("rightgill9");
		this.leftgill9 = this.body5.getChild("leftgill9");
		this.rightgill10 = this.body5.getChild("rightgill10");
		this.leftgill10 = this.body5.getChild("leftgill10");
		this.rightgill11 = this.body5.getChild("rightgill11");
		this.leftgill11 = this.body5.getChild("leftgill11");
		this.rightgill12 = this.body5.getChild("rightgill12");
		this.leftgill12 = this.body5.getChild("leftgill12");
		this.body6 = this.body5.getChild("body6");
		this.body7 = this.body6.getChild("body7");
		this.body8 = this.body7.getChild("body8");
		this.leftleg6 = this.base2.getChild("leftleg6");
		this.leftleg7 = this.base2.getChild("leftleg7");
		this.leftleg8 = this.base2.getChild("leftleg8");
		this.leftleg9 = this.base2.getChild("leftleg9");
		this.leftleg10 = this.base2.getChild("leftleg10");
		this.rightantenna2 = this.base2.getChild("rightantenna2");
		this.leftantenna2 = this.base2.getChild("leftantenna2");
		this.carapace2 = this.base2.getChild("carapace2");
		this.bone = this.fossil.getChild("bone");
		this.base = this.fossil.getChild("base");
		this.body1 = this.base.getChild("body1");
		this.rightgill1 = this.body1.getChild("rightgill1");
		this.leftgill1 = this.body1.getChild("leftgill1");
		this.rightgill2 = this.body1.getChild("rightgill2");
		this.leftgill2 = this.body1.getChild("leftgill2");
		this.rightgill3 = this.body1.getChild("rightgill3");
		this.leftgill7 = this.body1.getChild("leftgill7");
		this.rightgill4 = this.body1.getChild("rightgill4");
		this.leftgill4 = this.body1.getChild("leftgill4");
		this.rightgill5 = this.body1.getChild("rightgill5");
		this.leftgill5 = this.body1.getChild("leftgill5");
		this.rightgill6 = this.body1.getChild("rightgill6");
		this.leftgill6 = this.body1.getChild("leftgill6");
		this.body2 = this.body1.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.leftleg1 = this.base.getChild("leftleg1");
		this.leftleg2 = this.base.getChild("leftleg2");
		this.leftleg3 = this.base.getChild("leftleg3");
		this.leftleg4 = this.base.getChild("leftleg4");
		this.leftleg5 = this.base.getChild("leftleg5");
		this.rightantenna = this.base.getChild("rightantenna");
		this.leftantenna = this.base.getChild("leftantenna");
		this.carapace = this.base.getChild("carapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base2 = fossil.addOrReplaceChild("base2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.8205F, -2.25F, 0.8935F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r1 = base2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -0.0897F, -1.3613F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r2 = base2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1897F, 0.6387F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = base2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 19).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.025F, 0.2793F, 0.7226F, 0.1309F, 0.0F, -3.1416F));

		PartDefinition body5 = base2.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7151F, 3.7685F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition rightgill7 = body5.addOrReplaceChild("rightgill7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -18.7989F, 0.0F, 0.1745F, -0.6981F));

		PartDefinition leftgill3 = body5.addOrReplaceChild("leftgill3", CubeListBuilder.create().texOffs(0, 28).addBox(11.6874F, -0.0076F, 15.255F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8175F, -18.7989F, 0.0F, -0.1745F, 1.5708F));

		PartDefinition rightgill8 = body5.addOrReplaceChild("rightgill8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -18.2989F, 0.0F, 0.3054F, -0.7854F));

		PartDefinition leftgill8 = body5.addOrReplaceChild("leftgill8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.8175F, -18.2989F, 0.0F, -0.3054F, 1.5708F));

		PartDefinition rightgill9 = body5.addOrReplaceChild("rightgill9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -17.5489F, 0.0F, 0.48F, -0.829F));

		PartDefinition leftgill9 = body5.addOrReplaceChild("leftgill9", CubeListBuilder.create().texOffs(8, 38).addBox(15.8089F, 0.0F, 11.0229F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8175F, -17.5489F, 0.0F, -0.48F, 1.5708F));

		PartDefinition rightgill10 = body5.addOrReplaceChild("rightgill10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -16.7989F, 0.0F, 0.4363F, -0.8727F));

		PartDefinition leftgill10 = body5.addOrReplaceChild("leftgill10", CubeListBuilder.create().texOffs(0, 37).addBox(14.8022F, 0.0124F, 11.7017F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8175F, -16.7989F, 0.0F, -0.4363F, 1.5708F));

		PartDefinition rightgill11 = body5.addOrReplaceChild("rightgill11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -16.2989F, 0.0F, 0.4363F, -0.9163F));

		PartDefinition leftgill11 = body5.addOrReplaceChild("leftgill11", CubeListBuilder.create().texOffs(18, 19).addBox(15.3022F, 0.0F, 11.7017F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8175F, -16.2989F, 0.0F, -0.4363F, 1.5708F));

		PartDefinition rightgill12 = body5.addOrReplaceChild("rightgill12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -7.8175F, -15.7989F, 0.0F, 0.6109F, -0.9599F));

		PartDefinition leftgill12 = body5.addOrReplaceChild("leftgill12", CubeListBuilder.create().texOffs(12, 5).addBox(16.6451F, 0.0124F, 8.7129F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8175F, -15.7989F, 0.0F, -0.6109F, 1.5708F));

		PartDefinition body6 = body5.addOrReplaceChild("body6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0125F, 0.1376F, 1.1058F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body6.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 32).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, -0.7011F, 1.4306F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = body6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 33).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -0.201F, 1.4306F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body7 = body6.addOrReplaceChild("body7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0125F, -0.188F, 2.7901F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1926F, 1.2601F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body8 = body7.addOrReplaceChild("body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0025F, -0.2826F, 2.6774F, -0.0055F, -0.1761F, 1.4951F));

		PartDefinition cube_r8 = body8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 28).addBox(-0.5F, -0.15F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.948F, 0.0968F, 4.0348F, 0.0582F, 0.4372F, 0.0963F));

		PartDefinition cube_r9 = body8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 29).addBox(-0.5F, -0.075F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8296F, -0.0866F, 3.996F, -0.0121F, -0.4339F, 0.101F));

		PartDefinition cube_r10 = body8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 12).addBox(-0.5F, 0.0F, 0.1F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.063F, 0.0057F, -0.2351F, 0.0131F, 0.0F, 0.0436F));

		PartDefinition leftleg6 = base2.addOrReplaceChild("leftleg6", CubeListBuilder.create().texOffs(18, 21).addBox(0.7763F, 0.8448F, 18.901F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -12.9009F, -14.2081F, 0.0F, 0.6981F, 1.5708F));

		PartDefinition leftleg7 = base2.addOrReplaceChild("leftleg7", CubeListBuilder.create().texOffs(0, 39).addBox(2.2075F, 1.694F, 18.7411F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -12.9009F, -13.7081F, 0.0F, 0.6109F, 1.5708F));

		PartDefinition leftleg8 = base2.addOrReplaceChild("leftleg8", CubeListBuilder.create().texOffs(12, 17).addBox(4.4296F, 0.8448F, 18.1118F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -12.9009F, -13.2081F, 0.0F, 0.48F, 1.5708F));

		PartDefinition leftleg9 = base2.addOrReplaceChild("leftleg9", CubeListBuilder.create().texOffs(0, 23).addBox(5.7341F, 0.7448F, 17.8464F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -12.7509F, -12.7081F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition leftleg10 = base2.addOrReplaceChild("leftleg10", CubeListBuilder.create().texOffs(12, 0).addBox(6.8045F, 0.8448F, 17.2116F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -12.6509F, -12.0581F, 0.0F, 0.3491F, 1.5708F));

		PartDefinition rightantenna2 = base2.addOrReplaceChild("rightantenna2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.35F, -13.8009F, -15.7081F, 0.0436F, 0.2182F, -0.6109F));

		PartDefinition leftantenna2 = base2.addOrReplaceChild("leftantenna2", CubeListBuilder.create(), PartPose.offset(-0.8F, -13.8009F, -15.7081F));

		PartDefinition cube_r11 = leftantenna2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 17).addBox(13.6113F, -0.75F, 9.3468F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition carapace2 = base2.addOrReplaceChild("carapace2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, -14.4009F, -15.2081F, 0.0843F, -0.0226F, 0.2608F));

		PartDefinition cube_r12 = carapace2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 10).addBox(12.7663F, 0.0F, 9.6078F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4253F, 2.0886F, 3.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition bone = fossil.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(16.0F, -2.0F, 16.475F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 56).addBox(-13.0F, -2.0F, -20.0F, 18.0F, 2.0F, 12.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 0).addBox(-8.0F, -2.0F, -8.0F, 26.0F, 2.0F, 25.0F, new CubeDeformation(0.006F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, -2.0F, 0.0F, 7.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 17.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 28).addBox(0.0F, -2.0F, -12.0F, 25.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 0.0F, -8.0F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(53, 44).addBox(0.7F, -2.0F, 0.7F, 18.0F, 2.0F, 12.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(5.0F, 0.0F, -21.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition base = fossil.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -2.05F, -11.75F, 0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r16 = base.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.225F, -1.4F, -2.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = base.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(15, 6).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -1.5F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r18 = base.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 19).addBox(0.0F, -0.5F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.175F, -1.031F, 0.084F, 0.1309F, 0.0F, -3.1416F));

		PartDefinition body1 = base.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -2.0F, 2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body1.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition rightgill1 = body1.addOrReplaceChild("rightgill1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 0.1745F, -0.6981F));

		PartDefinition leftgill1 = body1.addOrReplaceChild("leftgill1", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -0.25F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, 0.0F, -0.1745F, 1.5708F));

		PartDefinition rightgill2 = body1.addOrReplaceChild("rightgill2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.5F, 0.0F, 0.3054F, -0.7854F));

		PartDefinition leftgill2 = body1.addOrReplaceChild("leftgill2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 2.0F, 0.5F, 0.0F, -0.3054F, 1.5708F));

		PartDefinition rightgill3 = body1.addOrReplaceChild("rightgill3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 1.25F, 0.0F, 0.48F, -0.829F));

		PartDefinition leftgill7 = body1.addOrReplaceChild("leftgill7", CubeListBuilder.create().texOffs(8, 38).addBox(0.0F, 0.0F, -0.25F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 1.25F, 0.0F, -0.48F, 1.5708F));

		PartDefinition rightgill4 = body1.addOrReplaceChild("rightgill4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 2.0F, 0.0F, 0.4363F, -0.8727F));

		PartDefinition leftgill4 = body1.addOrReplaceChild("leftgill4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.01F, -0.25F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 2.0F, 0.0F, -0.4363F, 1.5708F));

		PartDefinition rightgill5 = body1.addOrReplaceChild("rightgill5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 2.5F, 0.0F, 0.4363F, -0.9163F));

		PartDefinition leftgill5 = body1.addOrReplaceChild("leftgill5", CubeListBuilder.create().texOffs(18, 19).addBox(0.0F, 0.0F, -0.25F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 2.5F, 0.0F, -0.4363F, 1.5708F));

		PartDefinition rightgill6 = body1.addOrReplaceChild("rightgill6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 2.0F, 3.0F, 0.0F, 0.6109F, -0.9599F));

		PartDefinition leftgill6 = body1.addOrReplaceChild("leftgill6", CubeListBuilder.create().texOffs(12, 5).addBox(-0.5F, 0.02F, -0.4F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 3.0F, 0.0F, -0.6109F, 1.5708F));

		PartDefinition body2 = body1.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.925F, 2.6F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r20 = body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 32).addBox(-0.05F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.525F, -0.5F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r21 = body2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(14, 33).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.25F, 2.7F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.0453F, 0.478F, 1.4725F));

		PartDefinition cube_r23 = body4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 28).addBox(-0.45F, -1.0F, 0.6F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, -0.0436F, 0.4363F, 0.0F));

		PartDefinition cube_r24 = body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(14, 29).addBox(-0.55F, -1.0F, 0.6F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 0.003F, -0.4346F, 0.0962F));

		PartDefinition cube_r25 = body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 12).addBox(-0.5F, -1.5F, 4.75F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition leftleg1 = base.addOrReplaceChild("leftleg1", CubeListBuilder.create().texOffs(18, 21).addBox(-0.75F, 0.8448F, -0.4554F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6F, -1.0F, 0.0F, 0.6981F, 1.5708F));

		PartDefinition leftleg2 = base.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, 1.694F, -0.4086F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6F, -0.5F, 0.0F, 0.6109F, 1.5708F));

		PartDefinition leftleg3 = base.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(12, 17).addBox(-1.25F, 0.8448F, -0.4554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.6F, 0.0F, 0.0F, 0.48F, 1.5708F));

		PartDefinition leftleg4 = base.addOrReplaceChild("leftleg4", CubeListBuilder.create().texOffs(0, 23).addBox(-0.75F, 0.7448F, -0.4554F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.45F, 0.5F, 0.0F, 0.4363F, 1.5708F));

		PartDefinition leftleg5 = base.addOrReplaceChild("leftleg5", CubeListBuilder.create().texOffs(12, 0).addBox(-1.25F, 0.8448F, -0.4554F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.35F, 1.15F, 0.0F, 0.3491F, 1.5708F));

		PartDefinition rightantenna = base.addOrReplaceChild("rightantenna", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.15F, -1.5F, -2.5F, 0.0436F, 0.2182F, -0.6109F));

		PartDefinition leftantenna = base.addOrReplaceChild("leftantenna", CubeListBuilder.create(), PartPose.offset(-0.6F, -1.5F, -2.5F));

		PartDefinition cube_r26 = leftantenna.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -0.75F, -4.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition carapace = base.addOrReplaceChild("carapace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.55F, -2.1F, -2.0F, 0.0843F, -0.0226F, 0.2608F));

		PartDefinition cube_r27 = carapace.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4253F, 2.0886F, 3.0F, 0.0F, 0.0F, 1.309F));

		return LayerDefinition.create(meshdefinition, 128, 77);
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